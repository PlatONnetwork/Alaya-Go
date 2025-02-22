package network.platon.contracts.evm.v0_5_17;

import com.alaya.abi.solidity.TypeReference;
import com.alaya.abi.solidity.datatypes.Function;
import com.alaya.abi.solidity.datatypes.Type;
import com.alaya.abi.solidity.datatypes.generated.Uint256;
import com.alaya.crypto.Credentials;
import com.alaya.protocol.Web3j;
import com.alaya.protocol.core.RemoteCall;
import com.alaya.tx.Contract;
import com.alaya.tx.TransactionManager;
import com.alaya.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.alaya.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.13.2.1.
 */
public class Visibility extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610104806100206000396000f3fe6080604052348015600f57600080fd5b506004361060325760003560e01c8063b8b1feb4146037578063ca77156f146076575b600080fd5b606060048036036020811015604b57600080fd5b810190808035906020019092919050505060b5565b6040518082815260200191505060405180910390f35b609f60048036036020811015608a57600080fd5b810190808035906020019092919050505060c2565b6040518082815260200191505060405180910390f35b6000600382019050919050565b600060028201905091905056fea265627a7a723158201fdfb30dbf806b1e68d3c4ec30a09f312cb7f542217bca8afcaeb1af06c4ce5764736f6c63430005110032";

    public static final String FUNC_FE = "fe";

    public static final String FUNC_FPUB = "fpub";

    protected Visibility(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    protected Visibility(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }

    public RemoteCall<BigInteger> fe(BigInteger a) {
        final Function function = new Function(FUNC_FE, 
                Arrays.<Type>asList(new Uint256(a)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> fpub(BigInteger a) {
        final Function function = new Function(FUNC_FPUB, 
                Arrays.<Type>asList(new Uint256(a)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<Visibility> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return deployRemoteCall(Visibility.class, web3j, credentials, contractGasProvider, BINARY,  "", chainId);
    }

    public static RemoteCall<Visibility> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return deployRemoteCall(Visibility.class, web3j, transactionManager, contractGasProvider, BINARY,  "", chainId);
    }

    public static Visibility load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return new Visibility(contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    public static Visibility load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return new Visibility(contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }
}
