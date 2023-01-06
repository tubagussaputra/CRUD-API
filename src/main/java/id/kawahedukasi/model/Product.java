package id.kawahedukasi.model;

import java.util.Date;

public class Product {
        private String id;
        private String name;
        private int count;
        private int price;
        private String type;
        private String description;
        private Date createdAt;
        private Date updatedAt;

        // constructor
        public Product(String id, String name, int count, int price, String type, String description, Date createdAt, Date updatedAt) {
                this.id = id;
                this.name = name;
                this.count = count;
                this.price = price;
                this.type = type;
                this.description = description;
                this.createdAt = createdAt;
                this.updatedAt = updatedAt;
        }

        // getters and setters
        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getCount() {
                return count;
        }

        public void setCount(int count) {
                this.count = count;
        }

        public int getPrice() {
                return price;
        }

        public void setPrice(int price) {
                this.price = price;
        }

        public String getType() {
                return type;
        }

        public void setType(String type) {
                this.type = type;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public Date getCreatedAt() {
                return createdAt;
        }

        public void setCreatedAt(Date createdAt) {
                this.createdAt = createdAt;
        }

        public Date getUpdatedAt() {
                return updatedAt;
        }

        public void setUpdatedAt(Date updatedAt) {
                this.updatedAt = updatedAt;
        }
}
