pragma solidity ^0.7.1;
import "./BaseAbstractInterface.sol";

/**
 * @author qudong
 * @dev 2019/12/23
 * 基础合约（定义抽象合约继承接口）
 */

abstract contract AbstractContractESubclass is AbstractContractAInterface {
    function setInterAge(int v) public virtual;
}
