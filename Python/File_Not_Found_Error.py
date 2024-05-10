def read_file(filename):
    with open(filename, 'r') as file:
        print(file.read())

read_file('non_existent_file.txt')

