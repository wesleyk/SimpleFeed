package models

import java.util.Date
import java.util.Calendar
import java.text.SimpleDateFormat

case class FeedElement(id: Long, title: String, content: String, postedOn: Date)

object FeedElement {

        def all(): List[FeedElement] = Nil

        def create(title: String, content: String, postedOn: Date) {}

        def delete(id: Long) {}

}
