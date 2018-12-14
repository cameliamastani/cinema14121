////package fr.iat.tpcinema.model;
////
////import javax.persistence.Column;
////import javax.persistence.GeneratedValue;
////import javax.persistence.GenerationType;
////import javax.persistence.Id;
////import java.util.ArrayList;
////import java.util.List;
////import java.util.Objects;
////
////import javax.persistence.*;
////@Entity
////@Table(name="persons")
////public class Personne {
////    private int id;
////    private String nom;
////    private String prenom;
////    private Integer naissance;
////    private String affiche;
////    private int type;  // 1 = acteur ; 2 = réalisateur
////    private List<Role> roles = new ArrayList<>();
////
////    public Personne(int id, String nom, String prenom, Integer naissance, String affiche, int type) {
////        this.id = id;
////        this.nom = nom;
////        this.prenom = prenom;
////        this.naissance = naissance;
////        this.affiche = affiche;
////        this.type = type;
////    }
////    @Id
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
////    @Column(name = "id", nullable = false)
////    public int getId() {
////        return id;
////    }
////
////    public void setId(int id) {
////        this.id = id;
////    }
////    @Basic
////    @Column(name = "surname", nullable = false, length = 60)
////
////    public String getNom() {
////        return nom;
////    }
////
////    public void setNom(String nom) {
////        this.nom = nom;
////    }
////
////    @Basic
////    @Column(name = "givenname", nullable = true, length = 40)
////
////    public String getPrenom() {
////        return prenom;
////    }
////
////    public void setPrenom(String prenom) {
////        this.prenom = prenom;
////    }
////
////
////    @Basic
////    @Column(name = "birth_year", nullable = true)
////    public Integer getNaissance() {
////        return naissance;
////    }
////
////    public void setNaissance(Integer naissance) {
////        this.naissance = naissance;
////    }
////
////
////    @Basic
////    @Column(name = "image_path", nullable = true, length = 80)
////
////    public String getAffiche() {
////        return affiche;
////    }
////
////    public void setAffiche(String affiche) {
////        this.affiche = affiche;
////    }
////
////
////    public int getType() {
////        return type;
////    }
////
////    public void setType(int type) {
////        this.type = type;
////    }
////
////    public List<Role> getRoles() {
////        return roles;
////    }
////
////    public void setRoles(List<Role> roles) {
////        this.roles = roles;
////    }
////
////    public void addRole(Role role){
////        if (!roles.contains(role)) {
////            this.roles.add(role);
////        }
////    }
////
////    @Override
////    public boolean equals(Object o) {
////        if (this == o) return true;
////        if (!(o instanceof Personne)) return false;
////        Personne personne = (Personne) o;
////        return getId() == personne.getId() &&
////                Objects.equals(getNom(), personne.getNom()) &&
////                Objects.equals(getPrenom(), personne.getPrenom()) &&
////                Objects.equals(getNaissance(), personne.getNaissance()) &&
////                Objects.equals(getAffiche(), personne.getAffiche()) &&
////                Objects.equals(roles, personne.roles);
////    }
////
////    @Override
////    public int hashCode() {
////        return Objects.hash(getId(), getNom(), getPrenom(), getNaissance(), getAffiche(), roles);
////    }
////
////    @Override
////    public String toString() {
////        return "Personne{" +
////                "id=" + id +
////                ", nom='" + nom + '\'' +
////                ", prenom='" + prenom + '\'' +
////                ", naissance=" + naissance +
////                ", affiche='" + affiche + '\'' +
////                ", roles=" + roles +
////                '}';
////    }
////}
//
//package fr.iat.tpcinema.model;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="persons")
//public class Personne {
//    private long id;
//    private String nom;
//    private String prenom;
//    private Integer naissance;
//    private String photoPath;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    @Basic
//    @Column(name = "surname", nullable = false, length = 60)
//    public String getNom() {
//        return nom;
//    }
//
//    public void setNom(String surname) {
//        this.nom = surname;
//    }
//
//    @Basic
//    @Column(name = "givenname", nullable = true, length = 40)
//    public String getPrenom() {
//        return prenom;
//    }
//
//    public void setPrenom(String givenname) {
//        this.prenom = givenname;
//    }
//
//    @Basic
//    @Column(name = "birth_year", nullable = true)
//    public Integer getNaissance() {
//        return naissance;
//    }
//
//    public void setNaissance(Integer birthYear) {
//        this.naissance = birthYear;
//    }
//
//    @Basic
//    @Column(name = "image_path", nullable = true, length = 80)
//    public String getPhotoPath() {
//        return photoPath;
//    }
//
//    public void setPhotoPath(String imagePath) {
//        this.photoPath = imagePath;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Personne persons = (Personne) o;
//
//        if (id != persons.id) return false;
//        if (nom != null ? !nom.equals(persons.nom) : persons.nom != null) return false;
//        if (prenom != null ? !prenom.equals(persons.prenom) : persons.prenom != null) return false;
//        if (naissance != null ? !naissance.equals(persons.naissance) : persons.naissance != null) return false;
//        if (photoPath != null ? !photoPath.equals(persons.photoPath) : persons.photoPath != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = (int) (id ^ (id >>> 32));
//        result = 31 * result + (nom != null ? nom.hashCode() : 0);
//        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
//        result = 31 * result + (naissance != null ? naissance.hashCode() : 0);
//        result = 31 * result + (photoPath != null ? photoPath.hashCode() : 0);
//        return result;
//    }
//}

package fr.iat.tpcinema.model;


import javax.persistence.*;

@Entity
@Table(name="persons")
public class Personne {
    private long id;
    private String nom;
    private String prenom;
    private Integer naissance;
    private String photoPath;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "surname", nullable = false, length = 60)
    public String getNom() {
        return nom;
    }

    public void setNom(String surname) {
        this.nom = surname;
    }

    @Basic
    @Column(name = "givenname", nullable = true, length = 40)
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String givenname) {
        this.prenom = givenname;
    }

    @Basic
    @Column(name = "birth_year", nullable = true)
    public Integer getNaissance() {
        return naissance;
    }

    public void setNaissance(Integer birthYear) {
        this.naissance = birthYear;
    }

    @Basic
    @Column(name = "image_path", nullable = true, length = 80)
    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String imagePath) {
        this.photoPath = imagePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personne persons = (Personne) o;

        if (id != persons.id) return false;
        if (nom != null ? !nom.equals(persons.nom) : persons.nom != null) return false;
        if (prenom != null ? !prenom.equals(persons.prenom) : persons.prenom != null) return false;
        if (naissance != null ? !naissance.equals(persons.naissance) : persons.naissance != null) return false;
        if (photoPath != null ? !photoPath.equals(persons.photoPath) : persons.photoPath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (naissance != null ? naissance.hashCode() : 0);
        result = 31 * result + (photoPath != null ? photoPath.hashCode() : 0);
        return result;
    }
}
