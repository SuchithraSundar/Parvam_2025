from django.shortcuts import render, redirect
from . import models, forms

# Create your views here.

# to add students
def home(request):
    if request.method == "POST":
        student_form = forms.StudentForm(request.POST)  # Consistent naming
        if student_form.is_valid():
            student_form.save()
            student_form = forms.StudentForm()  # Reset form after saving
    else:
        student_form = forms.StudentForm()

    students = models.Student.objects.all()  # Fetch all student records
    context = { "students": students, "student_form": student_form }  
    return render(request, "home.html", context)

# to edit students
def edit(request,id):
    student=models.Student.objects.get(id=id)  #similar to select*from Students where value=id;
    if request.method == "POST":
        std_form = forms.StudentForm(request.POST, instance=student)
        if std_form.is_valid():
            std_form.save()
            return redirect(home)
    else:
        student_form =forms.StudentForm(instance=student)
        context  = {"student_form": student_form }
        return render(request,"edit.html",context)

# to delete student
def delete(request,id):
    student=models.Student.objects.get(id=id)  #similar to select*from Students where value=id;
    if request.method == "POST":
        student.delete()
        return redirect(home)
    else:
        student_form =forms.StudentForm(instance=student)
        context  = {"student_form": student_form }
        return render(request,"delete.html",context)





def about(request):
    return render(request, "about.html")


def contact(request):
    return render(request, "contact.html")
