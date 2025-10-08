
public class Movie {

		private String m_title;
		private String m_genre;
		private int m_durationMinutes;
		
		public Movie() {
			
		}

     	public Movie(String title, String genre, int durationMinutes) {
			m_title = title;
			m_genre = genre;
			m_durationMinutes = durationMinutes;
		}	

		public String getM_title() {
			return m_title;
		}

		public void setM_title(String m_title) {
			this.m_title = m_title;
		}

		public String getM_genre() {
			return m_genre;
		}

		public void setM_genre(String m_genre) {
			this.m_genre = m_genre;
		}

		public int getM_durationMinutes() {
			return m_durationMinutes;
		}

		public void setM_durationMinutes(int m_durationMinutes) {
			this.m_durationMinutes = m_durationMinutes;
		}

		public String toString() {
        return "Movie title is " + getM_title() + ", Movie Genre is " + getM_genre() + ", Duration = " + getM_durationMinutes() + "\n";
                }

		
	
}
