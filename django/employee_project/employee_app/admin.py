from django.contrib import admin
from . import models

# Register your models here.

@admin.register(models.Employee)
class EmployeeAdmin(admin.ModelAdmin):
    list_display =["name","email","position","salary"]