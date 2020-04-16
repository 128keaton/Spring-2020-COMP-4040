correct_answers = ['A', 'C', 'A', 'A', 'D', 'B', 'C', 'A', 'C', 'B', 'A', 'D', 'C', 'A', 'D', 'C', 'B', 'B', 'D', 'A']
student_answers = open('./question1_answers.txt').readlines()
student_answers = list(map(lambda s: s.strip(), student_answers) )

correct_count = 0
incorrect_answers = []

for index in range(0, len(student_answers)):
	if (student_answers[index] == correct_answers[index]):
		correct_count += 1
	else:
		incorrect_answers.append(index + 1)
		
if (correct_count >= 15):
	print('Congratulations! You passed')
else:
	print('Sorry! You must correctly answer at least 15 questions to pass')
	
print('Total correct answers: %i' % correct_count)
print('Total incorrect answers: %i' % len(incorrect_answers))
print('Incorrect answers: ')

for question_number in incorrect_answers:
	print('Question %i' % question_number)