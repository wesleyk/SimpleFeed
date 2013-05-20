package models

import java.util.Date
import java.util.Calendar
import java.text.SimpleDateFormat

case class Feed(id: Long, title: String, content: String, postedOn: Date)

object Feed {

        def all(): List[FeedElement] = Nil

        def create(title: String, content: String, postedOn: Date) {}

        def delete(id: Long) {}

}
