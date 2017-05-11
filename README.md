# Java Inheritance

--Person interface with methods getName and getDetails (unimplemented)

--Abstract PersonBaseImpl class that implements Person with attribute String name, constructor that initializes name, and implements getName

--Teacher interface with method teachesFor (unimplemented)

--TeacherImpl class that extends PersonBaseImpl and implements Teacher with attribute thoughtCourseTitle, constructor that calls parent constructor with name and initializes thoughtCourseTitle, and implements teachesFor

--Student interface with method studiesFor (unimplemented)

--StudentImpl class that extends PersonBaseImpl and implements Student with attribute takenCourseTitle, constructor that calls parent constructor with name and initializes takenCourseTitle, and implements studiesFor

--MainEntry that initializes Person p1, p2, Teacher t to a new TeacherImpl with String, String, Student s to a new StudentImpl with String, String, sets p1 = t and p2 = s, and prints the name of p1 and p2