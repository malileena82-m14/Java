/*Scenario 2: Hospital Management System
Business Requirement
A hospital wants to maintain patient records.
The receptionist should:
•	Register patients.
•	Search patients.
•	Admit and discharge patients.
•	Count total patients.
________________________________________
Class
Patient
________________________________________
Objects
•	Ram
•	Sita
•	Mohan
Each patient is an object.
________________________________________
Instance Variables
patientId
name
age
disease
roomNo
Every patient has different values.
 Static Variables
 hospitalName
 totalPatients
These values are shared by all patients.
Array of Objects
Patient [] patients = new Patient [500];
Example Data
Patient Id	Name	Disease
P101	Ram	Fever
P102	Sita	Diabetes
P103	Mohan	Covid
________________________________________
Test Cases
Test Case 1
Input:
Register 3 patients.
Expected:totalPatients = 3
Test Case 2
Input: Discharge Patient P102.
Expected:
Patient removed successfully.
________________________________________
Test Case 3
Input:
Update room number of Ram.
Expected:
Only Ram's room number changes.
*/

Class Patient
{
	int patientId;
    String name;
    int age;
    String disease;
    int roomNo;
	
	static hospitalName;
    static totalPatients;
	
	Patient(id,name,age,disease,roomNo)
	{
		
	}
}
class QScenorioPatient
