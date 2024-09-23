package com.example.profilecardlayout

data class UserProfile constructor(val id: Int, val name: String, val status: Boolean, val drawableId: Int ) {
}

val userProfileList = arrayListOf<UserProfile>(
    UserProfile(id= 0, name= "Rey Anna", status = true, R.drawable.profilepic1),
    UserProfile(id= 1, name= "John Doe", status = false, R.drawable.pic2),
    UserProfile(id= 2, name= "Ad Elle", status = true, R.drawable.profilepic1),
    UserProfile(id= 3, name= "Oda Rohan", status = false, R.drawable.pic2),
    UserProfile(id= 4, name= "Pop Simon", status = true, R.drawable.profilepic1),
    UserProfile(id= 5, name= "Mike Thomas", status = false, R.drawable.pic2),
    UserProfile(id= 6, name= "Anna Belle", status = true, R.drawable.profilepic1),
    UserProfile(id= 7, name= "Arnaud Moche", status = false, R.drawable.pic2),
    UserProfile(id= 8, name= "Lisa Simpson", status = true, R.drawable.profilepic1),
    UserProfile(id= 9, name= "Ken Shuri", status = false, R.drawable.pic2),
)