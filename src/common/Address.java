package common;

public class Address {
    private String address1;
    private String address2;
    private String city;
    private String state;
    private int zip;
    private String phone;
    private String email;

    public Address(String address1, String city, String state, int zip) {
        this.address1 = address1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.address1 != null ? this.address1.hashCode() : 0);
        hash = 17 * hash + (this.city != null ? this.city.hashCode() : 0);
        hash = 17 * hash + (this.state != null ? this.state.hashCode() : 0);
        hash = 17 * hash + this.zip;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Address other = (Address) obj;
        if ((this.address1 == null) ? (other.address1 != null) : !this.address1.equals(other.address1)) {
            return false;
        }
        if ((this.city == null) ? (other.city != null) : !this.city.equals(other.city)) {
            return false;
        }
        if ((this.state == null) ? (other.state != null) : !this.state.equals(other.state)) {
            return false;
        }
        if (this.zip != other.zip) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return address1 + ", City: " + city;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    

    

}
