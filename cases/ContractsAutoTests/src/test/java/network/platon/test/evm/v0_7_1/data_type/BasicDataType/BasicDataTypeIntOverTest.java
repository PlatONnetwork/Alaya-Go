package network.platon.test.evm.v0_7_1.data_type.BasicDataType;

import com.alaya.protocol.core.methods.response.TransactionReceipt;
import network.platon.contracts.evm.v0_7_1.BasicDataTypeContract;
import network.platon.test.evm.beforetest.ContractPrepareTest;
import network.platon.autotest.junit.annotations.DataSource;
import network.platon.autotest.junit.enums.DataSourceType;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

/**
 * @title 测试：有符号8位整数数据溢出(8位有符号整数取值范围-128~127)
 * @description:
 * @author: qudong
 * @create: 2019/12/25 15:09
 **/
public class BasicDataTypeIntOverTest extends ContractPrepareTest {

    private String uintParam;
    private String resultParam;


    @Before
    public void before() {
       this.prepare();
        uintParam = driverService.param.get("uintParam");
        resultParam = driverService.param.get("resultParam");
    }

    @Test
    @DataSource(type = DataSourceType.EXCEL, file = "test.xls", author = "qudong", showName = "BasicDataTypeUintOverTest.有符号8位整数数据溢出",sourcePrefix = "evm/0.7.1")
    public void testBasicDataTypeContract() {

        BasicDataTypeContract basicDataTypeContract = null;
        try {
            //合约部署
            basicDataTypeContract = BasicDataTypeContract.deploy(web3j, transactionManager, provider, chainId).send();
            String contractAddress = basicDataTypeContract.getContractAddress();
            TransactionReceipt tx =  basicDataTypeContract.getTransactionReceipt().get();
            collector.logStepPass("BasicDataTypeContract issued successfully.contractAddress:" + contractAddress
                                    + ", hash:" + tx.getTransactionHash() + ",deploy gas used:" + tx.getGasUsed());
            collector.logStepPass("deployFinishCurrentBlockNumber:" + tx.getBlockNumber());
        } catch (Exception e) {
            collector.logStepFail("BasicDataTypeContract deploy fail.", e.toString());
            e.printStackTrace();
        }

        //调用合约方法
        //验证：有符号8位整数溢出(8位有符号整数取值范围-128~127)
        try {
            BigInteger resultValue = new BigInteger(resultParam);
            //赋值执行addIntOverflow()
            BigInteger actualValue = basicDataTypeContract.addIntOverflow(new BigInteger(uintParam)).send();
            collector.logStepPass("BasicDataTypeContract 执行addIntOverflow() successfully actualValue:" + actualValue + ",resultValue:" + resultValue);
            collector.assertEqual(actualValue,resultValue, "checkout  execute success.");
        } catch (Exception e) {
            collector.logStepFail("BasicDataTypeContract Calling Method fail.", e.toString());
            e.printStackTrace();
        }



    }
}
