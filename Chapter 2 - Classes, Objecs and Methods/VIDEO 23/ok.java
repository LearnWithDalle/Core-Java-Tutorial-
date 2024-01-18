public class ok {
        private static int numInstances = 0;
    
        protected static int getCount() {
            return numInstances;
        }
    
        private static void addInstance() {
            numInstances++;
        }
    
        public ok() {
            addInstance();
        }
    
        public static void main(String[] arguments) {
            System.out.println("Starting with " + getCount() + " instances");
    
            for (int i = 0; i < 500; ++i) {
                new ok();
            }
    
            System.out.println("Created " + getCount() + " instances");
        }
    }
    
    