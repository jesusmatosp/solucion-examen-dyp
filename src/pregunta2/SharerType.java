package pregunta2;

public enum SharerType {
    Facebook {
        public String toString() {
            return "Facebook";
        }
    },
    Twitter {
        public String toString() {
            return "Twitter";
        }
    },
    Reddit {
        public String toString() {
            return "Reddit";
        }
    }, // add jmatos
    Pinterest {
    	public String toString(){
    		return "Pinterest";
    	}
    }
}
