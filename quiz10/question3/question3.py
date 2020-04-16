my_list = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]


def remove_evens(e):
	return  e % 2 != 0
	

# Use a function
print(list(filter(remove_evens, my_list)))

# Use lambda
print(list(filter(lambda x: x % 2 != 0, my_list)))