pragma solidity ^0.7.1;
/**
 * 循环调用验证
 *
 *
 * @author Albedo
 * @dev 2019/12/19
 **/
contract LoopCall {
    uint sum;
    /**
     * 循环调用验证：分别测试循环调用执行效率
     * 0~100
     * 100~1000
     * 1000~10000
     * 10000~100000
     * 100000+
     **/
    function loopCallTest(uint n) public {
        for(uint i=0;i<n;i++){
            sum++;
        }
    }
}