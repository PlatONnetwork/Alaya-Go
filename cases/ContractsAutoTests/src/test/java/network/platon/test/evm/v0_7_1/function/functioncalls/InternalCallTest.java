package network.platon.test.evm.v0_7_1.function.functioncalls;

import com.alaya.protocol.core.methods.response.TransactionReceipt;
import network.platon.contracts.evm.v0_7_1.IntenalCall;
import network.platon.test.evm.beforetest.ContractPrepareTest;
import network.platon.autotest.junit.annotations.DataSource;
import network.platon.autotest.junit.enums.DataSourceType;
import org.junit.Before;
import org.junit.Test;
import java.math.BigInteger;


/**
 * @title 验证函数内部调用
 * @description:
 * @author: liweic
 * @create: 2020/01/02 19:01
 **/

public class InternalCallTest extends ContractPrepareTest {

    @Before
    public void before() {
        this.prepare();
    }

    @Test
    @DataSource(type = DataSourceType.EXCEL, file = "test.xls", sheetName = "Sheet1",
            author = "liweic", showName = "function.InternalCallTest-函数内部调用测试", sourcePrefix = "evm/0.7.1")
    public void intercall() {
        try {
            IntenalCall intercall = IntenalCall.deploy(web3j, transactionManager, provider, chainId).send();

            String contractAddress = intercall.getContractAddress();
            TransactionReceipt tx = intercall.getTransactionReceipt().get();
            collector.logStepPass("intercall deploy successfully.contractAddress:" + contractAddress + ", hash:" + tx.getTransactionHash());
            collector.logStepPass("intercall deploy gasUsed:" + intercall.getTransactionReceipt().get().getGasUsed());

            //验证函数内部调用
            BigInteger result = intercall.getResult().send();
            collector.logStepPass("intercall函数返回值：" + result);
            collector.assertEqual(new BigInteger("9"),result);


        } catch (Exception e) {
            collector.logStepFail("InterCallContract Calling Method fail.", e.toString());
            e.printStackTrace();
        }
    }
}


