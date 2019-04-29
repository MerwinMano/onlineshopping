package mer.mano.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Category {

	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		int CategoryId;
		String CategoryName;
		String CategoryDescription;
		public int getCategoryId() {
			return CategoryId;
		}
		public void setCategoryId(int categoryId) {
			CategoryId = categoryId;
		}
		public String getCategoryName() {
			return CategoryName;
		}
		public void setCategoryName(String categoryName) {
			CategoryName = categoryName;
		}
		public String getCategoryDescription() {
			return CategoryDescription;
		}
		public void setCategoryDescription(String categoryDescription) {
			CategoryDescription = categoryDescription;
		}
		
		

	}


