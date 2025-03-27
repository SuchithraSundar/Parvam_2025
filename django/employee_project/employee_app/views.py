from django.shortcuts import render, redirect
from . import models, forms

# Create your views here.

# to add employees
def home(request):
    if request.method == "POST":
        employee_form = forms.EmployeeForm(request.POST)
        if employee_form.is_valid():
            employee_form.save()
            return redirect(home)  # Redirect to clear form after submission
    else:
        employee_form = forms.EmployeeForm()
    
    employees = models.Employee.objects.all()
    context = {"employees": employees, "employee_form": employee_form}
    return render(request, "home.html", context)


# to edit employee
def edit(request, id):
    employee = models.Employee.objects.get(id=id)
    if request.method == "POST":
        employee_form = forms.EmployeeForm(request.POST, instance=employee)
        if employee_form.is_valid():
            employee_form.save()
            return redirect(home)
    else:
        employee_form = forms.EmployeeForm(instance=employee)
        context = {"employee_form": employee_form}
        return render(request, "edit.html", context)



# to delete employee
def delete(request, id):
    employee = models.Employee.objects.get(id=id)
    if request.method == "POST":
        employee.delete()
        return redirect(home)
    else:
        employee_form = forms.EmployeeForm(instance=employee)
        context = {"employee_form": employee_form}
        return render(request, "edit.html", context)



