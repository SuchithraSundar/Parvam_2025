from django import forms
from . import models

class EmployeeForm(forms.ModelForm):
    class Meta:
       model =models.Employee
       fields = ["name", "email","position","salary"]
       widgets = {
            "name": forms.TextInput(
                attrs={"class":"form-control","placeholder": "Enter your name"}
            ),
            "email": forms.EmailInput(
                attrs={"class":"form-control","placeholder": "Enter your email"}
            ),
            "position": forms.TextInput(
                attrs={"class": "form-control", "placeholder": "Enter your position"}
            ),
            "salary":forms.NumberInput(
                attrs={"class":"form-control","placeholder":"Enter your salary"}
            ),
       }
          
        