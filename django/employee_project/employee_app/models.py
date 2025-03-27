from django.db import models

# Create your models here.

class Employee(models.Model):
    name = models.CharField(blank=False,max_length=200)
    email = models.EmailField(blank=False)
    position = models.CharField(blank=False,max_length=200)
    salary = models.DecimalField(blank=False,max_digits=10,decimal_places=2)
  
