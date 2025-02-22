package network.platon.contracts.evm.v0_4_26;

import com.alaya.abi.solidity.TypeReference;
import com.alaya.abi.solidity.datatypes.Address;
import com.alaya.abi.solidity.datatypes.Function;
import com.alaya.abi.solidity.datatypes.Type;
import com.alaya.abi.solidity.datatypes.generated.Uint256;
import com.alaya.crypto.Credentials;
import com.alaya.protocol.Web3j;
import com.alaya.protocol.core.RemoteCall;
import com.alaya.tuples.generated.Tuple3;
import com.alaya.tx.Contract;
import com.alaya.tx.TransactionManager;
import com.alaya.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.alaya.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.13.2.1.
 */
public class ContractAndAddressFunction extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506101eb806100206000396000f300608060405260043610610041576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff1680631a80e9cc14610043575b005b34801561004f57600080fd5b506100586100a8565b604051808473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001838152602001828152602001935050505060405180910390f35b6000806000806000806101239250309150600a8373ffffffffffffffffffffffffffffffffffffffff16311080156100f85750600a8273ffffffffffffffffffffffffffffffffffffffff163110155b1561017d578273ffffffffffffffffffffffffffffffffffffffff166108fc600a9081150290604051600060405180830381858888f19350505050158015610144573d6000803e3d6000fd5b508273ffffffffffffffffffffffffffffffffffffffff166108fc600a9081150290604051600060405180830381858888f19350505050505b339050808273ffffffffffffffffffffffffffffffffffffffff16318473ffffffffffffffffffffffffffffffffffffffff16319550955095505050509091925600a165627a7a723058204358543ab57aa2f574be6c0d974baf91a495a6558775d3ba074a091ef4e9e7360029";

    public static final String FUNC_ADDRESSCHECK = "addressCheck";

    protected ContractAndAddressFunction(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    protected ContractAndAddressFunction(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }

    public RemoteCall<Tuple3<String, BigInteger, BigInteger>> addressCheck() {
        final Function function = new Function(FUNC_ADDRESSCHECK, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteCall<Tuple3<String, BigInteger, BigInteger>>(
                new Callable<Tuple3<String, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple3<String, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<String, BigInteger, BigInteger>(
                                (String) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue());
                    }
                });
    }

    public static RemoteCall<ContractAndAddressFunction> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return deployRemoteCall(ContractAndAddressFunction.class, web3j, credentials, contractGasProvider, BINARY,  "", chainId);
    }

    public static RemoteCall<ContractAndAddressFunction> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return deployRemoteCall(ContractAndAddressFunction.class, web3j, transactionManager, contractGasProvider, BINARY,  "", chainId);
    }

    public static ContractAndAddressFunction load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return new ContractAndAddressFunction(contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    public static ContractAndAddressFunction load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return new ContractAndAddressFunction(contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }
}
