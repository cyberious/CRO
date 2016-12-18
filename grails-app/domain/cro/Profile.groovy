package cro

class Profile {

    String id
    String bio
    Boolean isPublic

    static mapping = {
        table 'profiles'
    }
}
