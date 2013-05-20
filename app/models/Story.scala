package models

import java.util.Date
import java.util.Calendar
import java.text.SimpleDateFormat

case class Story(id: Long, title: String, content: String, postedOn: Date)

object Story {
  
        def all(): List[Story] = Nil
  
        def create(title: String, content: String, postedOn: Date) {}
  
        def delete(id: Long) {}
  
}
