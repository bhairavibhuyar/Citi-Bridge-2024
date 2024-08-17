# CRUD Operations

class Employee:

    def __init__(self, id, name, department, salary):
        self.id = id
        self.name = name
        self.department = department
        self.salary = salary

employee = Employee(1, "John Doe", "Developer", 100)

print("Employee ID: ", employee.id)
print("Employee Name: ", employee.name)

# Array = List
employees = [Employee(1, "John Doe", "Developer", 100), Employee(2, "John Doe2", "Developer", 200)]
for e in employees:
    print(f"Name: {e.name}, ID: {e.id}")    # f = string/function based notation 