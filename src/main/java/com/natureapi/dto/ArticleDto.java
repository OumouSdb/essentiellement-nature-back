package com.natureapi.dto;

public class ArticleDto {
	
	private long id;
	private String title;
	private String image_name;
	private String texte;
	private long version;
	
		public ArticleDto() {
		super();
	}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getImage_name() {
			return image_name;
		}

		public void setImage_name(String image_name) {
			this.image_name = image_name;
		}

		public String getTexte() {
			return texte;
		}

		public void setTexte(String texte) {
			this.texte = texte;
		}

		public long getVersion() {
			return version;
		}

		public void setVersion(long version) {
			this.version = version;
		}

		
		
}
