# question4.py
# kbrleson
# COMP 4040

base_tuition = 8000.00
yearly_increase_percentage = 3.0
current_tuition = base_tuition

print('Base Tuition: ${:,.2f}'.format(base_tuition))

for year in range(1, 6):
	current_tuition = current_tuition + ((yearly_increase_percentage/100) * current_tuition)
	print(('Tuition for year %i: ${:,.2f}' % (year)).format(current_tuition))	