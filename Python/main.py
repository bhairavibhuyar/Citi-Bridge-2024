from Employee import Employee
from Ops import EmployeeOps

emp = Employee(3, "John Doe3", "Developer", "Mumbai")

empOps = EmployeeOps()

empOps.add_employee(emp)
empOps.get_employees()
