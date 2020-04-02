# question2.py
# kbrleson
# COMP 4040

# Calculates the average of the five scores given
def calc_average(score1, score2, score3, score4, score5):
	return (score1 + score2 + score3 + score4 + score5) / 5
	
# Returns a letter grade based off of the raw score
def determine_grade(raw_score):
	letter_grades = {
		'A': range(90, 100),
		'B': range(80, 89),
		'C': range(70, 79),
		'D': range(60, 69)
	}
	
	for item in letter_grades.items():
		letter_grade = item[0]
		score_range = item[1]
		
		if (raw_score in score_range):
			return letter_grade
	
	return 'F'
			
if __name__ == '__main__':
	print('Grade for a raw score of 90: %s' % determine_grade(90))
	print('Grade for a raw score of 85: %s' % determine_grade(85))
	print('Grade for a raw score of 71: %s' % determine_grade(71))
	print('Grade for a raw score of 60: %s' % determine_grade(60))
	print('Grade for a raw score of 30: %s' % determine_grade(30))
	
	print('Calculated average of raw scores [100, 95, 82, 60, 71]: %i' % calc_average(100, 95, 82, 60, 71))