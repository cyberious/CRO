package cro

class User {

    String id
    String firstName
    String lastName
    Date dateCreated
    String email
    String passwordHash

    static mapping = {
        table 'users'
        autoTimestamp true
    }

    static constraints = {
        dateCreated display: false
        email email: true, nullable: false, unique: true
        passwordHash password: true, editable: true
    }
}
