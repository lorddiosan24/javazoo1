package tn.esprit.gestionzoo.entities;

import java.util.ArrayList;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employee> {
    private final ArrayList<Employee> employees = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employee employee) {
        employees.add(employee);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return employees.stream().anyMatch(emp -> emp.getLastName().equals(nom));
    }

    @Override
    public boolean rechercherEmploye(Employee employee) {
        return employees.contains(employee);
    }

    @Override
    public void supprimerEmploye(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void displayEmploye() {
        employees.forEach(System.out::println);
    }

    @Override
    public void trierEmployeParId() {
        employees.sort(Comparator.comparingInt(Employee::getId));
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        employees.sort(Comparator.comparing(Employee::getLastName)
                .thenComparing(Employee::getDepartmentName)
                .thenComparingInt(Employee::getGrade));
    }
}
