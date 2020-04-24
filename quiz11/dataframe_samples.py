import pandas as pd
import numpy as np

#numbers = [[10, 20, 30, 40, 50], [60, 70, 80, 90, 100], [120, 140, 160, 180, 200], [220, 240, 260, 280, 300]]
#students = [['John', 'Doe', 90.7], ['Mary', 'Jennings', 88.3], ['Mustafa', 'Hizir', 79.1], ['Jack', 'Daniel', 96.5]]

#students = {'First Name': ['John', 'Mary', 'Mustafa', 'Jack'],
#			'Last Name': ['Doe', 'Jennings', 'Hizir', 'Daniel'],
#			'Grade': [90.7, 88.3, 79.1, 96.5]}
			
#students = [{'First Name': 'John', 'Last Name': 'Doe', 'Grade': 90.7},
#			{'First Name': 'Mary', 'Last Name': 'Jennings', 'Grade': 88.3},
#			{'First Name': 'Mustafa', 'Last Name': 'Hizir', 'Grade': 79.1},
#			{'First Name': 'Jack', 'Last Name': 'Daniel', 'Grade': 96.5}]
			
# df = pd.DataFrame(students, index=['student 1', 'student 2', 'student 3', 'student 4'])

# my_data = [{'x': 10, 'y': 22}, {'x': 55, 'y': 33, 'z': 22}]
# df = pd.DataFrame(my_data, columns=['x', 'y', 't'])

students = {'First Name': ['John', 'Mary', 'Mustafa', 'Jack', 'Smith', 'Joshua', 'Adam', 'Robert'],
			'Last Name': ['Doe', 'Jennings', 'Hizir', 'Daniel', 'Mullings', 'Sen', 'Allen', 'Yildirim'],
			'Grade': [90.7, 88.3, 79.1, 96.5, 55.9, 98.0, 82.9, 71.6],
			'Section': ['A', 'B', 'C', 'C', 'B', 'A', 'A', 'C']}
df = pd.DataFrame(students)
print(df)

grouped = df.groupby('Section')
print(grouped)
print(grouped.groups)

for name, group in grouped:
	print("Group name:", name)
	print(group)
	print(type(group))
	print()
	
print(grouped.get_group('C'))
print()


print(grouped['Grade'].agg(np.mean))
print(grouped['Grade'].agg([np.mean, np.sum, np.std]))