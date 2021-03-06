/*
 * This file is generated by jOOQ.
 */
package com.exigent.verifycore.db.jooq.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Persona implements Serializable {

    private static final long serialVersionUID = 1157480451;

    private Integer id;
    private String  externalid;
    private String  firstname;
    private String  lastname;
    private String  othername;

    public Persona() {}

    public Persona(Persona value) {
        this.id = value.id;
        this.externalid = value.externalid;
        this.firstname = value.firstname;
        this.lastname = value.lastname;
        this.othername = value.othername;
    }

    public Persona(
        Integer id,
        String  externalid,
        String  firstname,
        String  lastname,
        String  othername
    ) {
        this.id = id;
        this.externalid = externalid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.othername = othername;
    }

    public Integer getId() {
        return this.id;
    }

    public Persona setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getExternalid() {
        return this.externalid;
    }

    public Persona setExternalid(String externalid) {
        this.externalid = externalid;
        return this;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public Persona setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return this.lastname;
    }

    public Persona setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getOthername() {
        return this.othername;
    }

    public Persona setOthername(String othername) {
        this.othername = othername;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Persona other = (Persona) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (externalid == null) {
            if (other.externalid != null)
                return false;
        }
        else if (!externalid.equals(other.externalid))
            return false;
        if (firstname == null) {
            if (other.firstname != null)
                return false;
        }
        else if (!firstname.equals(other.firstname))
            return false;
        if (lastname == null) {
            if (other.lastname != null)
                return false;
        }
        else if (!lastname.equals(other.lastname))
            return false;
        if (othername == null) {
            if (other.othername != null)
                return false;
        }
        else if (!othername.equals(other.othername))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.externalid == null) ? 0 : this.externalid.hashCode());
        result = prime * result + ((this.firstname == null) ? 0 : this.firstname.hashCode());
        result = prime * result + ((this.lastname == null) ? 0 : this.lastname.hashCode());
        result = prime * result + ((this.othername == null) ? 0 : this.othername.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Persona (");

        sb.append(id);
        sb.append(", ").append(externalid);
        sb.append(", ").append(firstname);
        sb.append(", ").append(lastname);
        sb.append(", ").append(othername);

        sb.append(")");
        return sb.toString();
    }
}
