# exception.py
# kbrleson

import sys

class ScoreIsLessException(Exception):
    def __init__(self):
        super().__init__('This score is too low. You failed the exam.')


if __name__ == '__main__':
	try:
		exam_score = int(input('Please input a score: '))	
		
		if (exam_score < 50):
			raise ScoreIsLessException
		
		print('You passed the exam. Congratulations.')
		
	except ScoreIsLessException as exception_thrown:
		print(exception_thrown)