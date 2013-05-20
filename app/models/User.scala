package models

case class User(id: Long, username: String, passwordHash: String, stories: Set[Story])

object User {
        def create(username: String, password: String) {}

        def authenticate(username: String, password: String) {}
}
