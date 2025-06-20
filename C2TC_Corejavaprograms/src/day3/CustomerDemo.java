package day3;

public class CustomerDemo {
	
			 public int id;
			 public String name;
			 public String city;
			
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getCity() {
				return name;
			}
			public void setCity(String city) {
				this.city = city;
			}
			@Override
			public String toString() {
				return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
			}
			
}
