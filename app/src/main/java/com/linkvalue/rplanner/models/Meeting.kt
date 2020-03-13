package com.linkvalue.rplanner.models

import androidx.room.Entity

@Entity
data class Meeting(val room: Room, val subject:String, val reservedBy:String, val timetables:String)