    package com.company;

    public class Student {
        private int age;
        private String name;
        private String faculty;

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Student)) {//null не пройдет проверку
                return false;
            }
            Student student = (Student) obj;
            return this.age == student.age &&
                    this.name.equals(student.name) &&
                    this.faculty.equals(student.faculty);
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = result * 31 + age;
            result = result * 31 + name.hashCode();
            result = result * 31 + faculty.hashCode();
            return result;
        }
    }
