# read_csv.py
# kbrleson

csv_file_name = 'customers.csv'


def print_lines(lines):
	for row in lines:
		rowValues = row.split(',')
		print("%s, %s" % (rowValues[0], rowValues[1]))

if __name__ == '__main__':
	try:
		with open(csv_file_name, 'r') as csv_file:
			csv_data = csv_file.read()
			
			if not csv_data:
				raise ValueError("Could not read file '%s'" % csv_file_name)
			else:
				print_lines(csv_data.split('\n'))
				
	except IOError as exception_thrown:
		print("Exception thrown: %s" % exception_thrown.message)