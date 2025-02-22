pragma solidity ^0.5.17;
/**
 1.验证内联汇编关键字assembly,汇编赋值指令:=
 * @author liweic
 * @dev 2020/01/07 14:30
 */

contract AssemblyReturns {
    uint constant a = 2;
    bytes2 constant b = 0xabcd;
    bytes3 constant c = "abc";
    bool constant d = true;
//    address payable constant e = "lax1w2kjkufl4g2v93xd94a0lewc75ufdr66rnzuw2";
    address payable constant e = "atx1w2kjkufl4g2v93xd94a0lewc75ufdr66lx6pvq";
    function f() public pure returns (uint w, bytes2 x, bytes3 y, bool z, address t) {
        assembly {
            w := a
            x := b
            y := c
            z := d
            t := e
        }
    }
}