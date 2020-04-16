course_room_number = {
	'CS101': '3004',
	'CS102': '4501',
	'CS103': '6755',
	'NT110': '1244',
	'CM241': '1411'
}

course_number_instructor = {
	'CS101': 'Haynes',
	'CS102': 'Alvarado',
	'CS103': 'Rich',
	'NT110': 'Burke',
	'CM241': 'Lee'
}

course_number_meeting_time = {
	'CS101': '8:00 am',
	'CS102': '9:00 am',
	'CS103': '10:00 am',
	'NT110': '11:00 am',
	'CM241': '1:00 pm'
}

course_number = input("Please input a course number: ")

if course_number in course_room_number:
	print('Course: %s' % course_number)
	print('Meets at: %s' % course_number_meeting_time[course_number])
	print('Meets in room: %s' % course_room_number[course_number])
	print('Taught by: %s' % course_number_instructor[course_number])
else:
	print('Sorry, we do not offer that course')