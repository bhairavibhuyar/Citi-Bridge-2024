# class Employee:

#     def __init__(self, id, name, department, salary):
#         self.id = id
#         self.name = name
#         self.department = department
#         self.salary = salary

# from Employee import Employee

class EmployeeOps:
    employees = []
    
    def add_employee(self, emp):  
        self.employees.append(emp)

    def get_employees(self):  
        for e in self.employees:
            print(e.name)

# emp = Employee(3, "John Doe3", "Developer", "Mumbai")

# empOps = EmployeeOps()

# empOps.add_employee(emp)
# empOps.get_employees()

