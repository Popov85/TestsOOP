package com.goit.popov.test14Object;

/**
 * Created by Andrey on 10/4/2016.
 */
public class User {
        private String name;
        private int phone;

        public User(String name, int phone) {
                this.name = name;
                this.phone = phone;
        }

        public String getName() {
                return name;
        }

        public int getPhone() {
                return phone;
        }

        @Override
        public boolean equals(Object o) {
                System.out.println(this);
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                User user = (User) o;

                if (phone != user.phone) return false;
                return name != null ? name.equals(user.name) : user.name == null;

        }

        @Override
        public int hashCode() {
                int result = name != null ? name.hashCode() : 0;
                result = 31 * result + phone;
                return result;
        }

        @Override
        public String toString() {
                return "User{" +
                        "name='" + name + '\'' +
                        ", phone=" + phone +
                        '}';
        }
}
