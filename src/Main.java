//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
class SimpleStartupTestDrive {
    public static void main(String[] args) {
        SimpleStartup simpleStartup = new SimpleStartup();

        int[] locations = {2,3,4};
        simpleStartup.setLocationCells(locations);

        int UserGuess = 2;
        String result = simpleStartup.checkYourself(UserGuess);

        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}
