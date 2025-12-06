class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> a=Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int min=1;
        int max=nums.length;
        IntStream exp=IntStream.rangeClosed(min,max);
        List<Integer> b=exp.filter(n -> !a.contains(n)).boxed().collect(Collectors.toList());
        return b;
    }
}