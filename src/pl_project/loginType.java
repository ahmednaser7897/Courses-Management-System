
package pl_project;


public class loginType {
    boolean logged = false, studentLogged = false, instLogged = false, adminLogged = false;

    public loginType() {
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public void setStudentLogged(boolean studentLogged) {
        this.studentLogged = studentLogged;
    }

    public void setInstLogged(boolean instLogged) {
        this.instLogged = instLogged;
    }

    public void setAdminLogged(boolean adminLogged) {
        this.adminLogged = adminLogged;
    }

    public boolean isLogged() {
        return logged;
    }

    public boolean isStudentLogged() {
        return studentLogged;
    }

    public boolean isInstLogged() {
        return instLogged;
    }

    public boolean isAdminLogged() {
        return adminLogged;
    }
    
}
