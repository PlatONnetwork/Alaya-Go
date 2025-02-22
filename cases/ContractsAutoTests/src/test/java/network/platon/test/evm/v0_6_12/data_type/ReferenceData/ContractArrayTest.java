package network.platon.test.evm.v0_6_12.data_type.ReferenceData;

import com.alaya.protocol.core.methods.response.TransactionReceipt;
import network.platon.contracts.evm.v0_6_12.ContractArray;
import network.platon.test.evm.beforetest.ContractPrepareTest;
import network.platon.autotest.junit.annotations.DataSource;
import network.platon.autotest.junit.enums.DataSourceType;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @title 验证ContractArray
 * @description:
 * @author: liweic
 * @create: 2020/01/11 19:01
 **/

public class ContractArrayTest extends ContractPrepareTest {


    @Before
    public void before() {
        this.prepare();
    }

    @Test
    @DataSource(type = DataSourceType.EXCEL, file = "test.xls", sheetName = "Sheet1",
            author = "liweic", showName = "data_type.ContractArrayTest-合约数组测试",sourcePrefix = "evm/0.6.12")
    public void Contractarray() {
        try {
            ContractArray contractarray = ContractArray.deploy(web3j, transactionManager, provider, chainId).send();

            String contractAddress = contractarray.getContractAddress();
            TransactionReceipt tx = contractarray.getTransactionReceipt().get();
            collector.logStepPass("ContractArray deploy successfully.contractAddress:" + contractAddress + ", hash:" + tx.getTransactionHash() + ",deploy gas used:" + tx.getGasUsed());

            //验证合约数组
            TransactionReceipt resultA = contractarray.f().send();

            String getx = contractarray.getx().send();
            collector.logStepPass("合约数组X返回值：" + getx);
            collector.assertEqual(getx.toLowerCase() ,contractAddress);

            List gety = contractarray.gety().send();
            String addressy = gety.get(3).toString();
            collector.logStepPass("合约数组Y返回值：" + addressy);
            collector.assertEqual(addressy.toLowerCase() ,contractAddress);



        } catch (Exception e) {
            collector.logStepFail("ContractArrayContract Calling Method fail.", e.toString());
            e.printStackTrace();
        }
    }
}


