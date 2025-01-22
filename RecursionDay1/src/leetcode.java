class Main {
    public static void main(String[] Args){

        String s = "abaacbcbb";

        int ans = minimumLength(s);

        System.out.print(ans);
    }

    static int minimumLength(String s) {
        
        StringBuilder builder = new StringBuilder(s);

        int ans = delete(builder , 0);
        return ans;

    }

    static int delete(StringBuilder builder, int start) {

        int count = 1;

        for (int i = start + 1; i < builder.length() - 1; i++) {

            if (builder.charAt(i) == builder.charAt(start)) {
                count++;
            }

            if (count >= 3) {
                builder.deleteCharAt(start);
                builder.deleteCharAt(i);
                count = 1;

            }
            if(start > builder.length()){
                return builder.length();
            }
            if (i == builder.length() - 1) {
                return delete(builder , start+1);
            }
        }

        return builder.length();

    }
}
