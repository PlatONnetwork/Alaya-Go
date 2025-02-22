package network.platon.contracts.evm.v0_6_12;

import com.alaya.abi.solidity.TypeReference;
import com.alaya.abi.solidity.datatypes.Function;
import com.alaya.abi.solidity.datatypes.Type;
import com.alaya.abi.solidity.datatypes.generated.Bytes1;
import com.alaya.abi.solidity.datatypes.generated.Bytes2;
import com.alaya.abi.solidity.datatypes.generated.Bytes4;
import com.alaya.abi.solidity.datatypes.generated.Int16;
import com.alaya.abi.solidity.datatypes.generated.Int8;
import com.alaya.abi.solidity.datatypes.generated.Uint16;
import com.alaya.abi.solidity.datatypes.generated.Uint32;
import com.alaya.crypto.Credentials;
import com.alaya.protocol.Web3j;
import com.alaya.protocol.core.RemoteCall;
import com.alaya.tuples.generated.Tuple2;
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
public class TypeConversionContract extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610305806100206000396000f3fe608060405234801561001057600080fd5b506004361061007d5760003560e01c806399a909621161005b57806399a909621461010f578063a136096714610159578063ad42221214610196578063dcefd42f146101b75761007d565b8063744708f814610082578063853255cc146100cc5780639311ca69146100ed575b600080fd5b61008a6101f7565b604051808363ffffffff168152602001827bffffffffffffffffffffffffffffffffffffffffffffffffffffffff191681526020019250505060405180910390f35b6100d4610219565b604051808260010b815260200191505060405180910390f35b6100f5610233565b604051808261ffff16815260200191505060405180910390f35b61011761024a565b604051808361ffff168152602001827dffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff191681526020019250505060405180910390f35b61016161026a565b60405180827bffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916815260200191505060405180910390f35b61019e6102a3565b604051808260000b815260200191505060405180910390f35b6101bf6102b7565b60405180827effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916815260200191505060405180910390f35b6000806000611234905060008161ffff169050808160e01b9350935050509091565b60008060029050600060649050808260000b019250505090565b600080600a905060008160ff169050809250505090565b6000806000631234567890506000819050808160f01b9350935050509091565b60008061123460f01b90506000817dffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff19169050809250505090565b600080600190506000819050809250505090565b60008061123460f01b9050600081905080925050509056fea2646970667358221220bc17b49b7f020711417e1e55e6795e755a7516b8328902cdc64c3ca336546aa964736f6c634300060c0033";

    public static final String FUNC_CONVERSION = "conversion";

    public static final String FUNC_DISPLAYCONVERSION = "displayConversion";

    public static final String FUNC_DISPLAYCONVERSION1 = "displayConversion1";

    public static final String FUNC_DISPLAYCONVERSION2 = "displayConversion2";

    public static final String FUNC_DISPLAYCONVERSION3 = "displayConversion3";

    public static final String FUNC_DISPLAYCONVERSION4 = "displayConversion4";

    public static final String FUNC_SUM = "sum";

    protected TypeConversionContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    protected TypeConversionContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }

    public RemoteCall<BigInteger> conversion() {
        final Function function = new Function(FUNC_CONVERSION, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint16>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> displayConversion() {
        final Function function = new Function(FUNC_DISPLAYCONVERSION, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Tuple2<BigInteger, byte[]>> displayConversion1() {
        final Function function = new Function(FUNC_DISPLAYCONVERSION1, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint16>() {}, new TypeReference<Bytes2>() {}));
        return new RemoteCall<Tuple2<BigInteger, byte[]>>(
                new Callable<Tuple2<BigInteger, byte[]>>() {
                    @Override
                    public Tuple2<BigInteger, byte[]> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<BigInteger, byte[]>(
                                (BigInteger) results.get(0).getValue(), 
                                (byte[]) results.get(1).getValue());
                    }
                });
    }

    public RemoteCall<Tuple2<BigInteger, byte[]>> displayConversion2() {
        final Function function = new Function(FUNC_DISPLAYCONVERSION2, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint32>() {}, new TypeReference<Bytes4>() {}));
        return new RemoteCall<Tuple2<BigInteger, byte[]>>(
                new Callable<Tuple2<BigInteger, byte[]>>() {
                    @Override
                    public Tuple2<BigInteger, byte[]> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<BigInteger, byte[]>(
                                (BigInteger) results.get(0).getValue(), 
                                (byte[]) results.get(1).getValue());
                    }
                });
    }

    public RemoteCall<byte[]> displayConversion3() {
        final Function function = new Function(FUNC_DISPLAYCONVERSION3, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes1>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> displayConversion4() {
        final Function function = new Function(FUNC_DISPLAYCONVERSION4, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes4>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<BigInteger> sum() {
        final Function function = new Function(FUNC_SUM, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int16>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<TypeConversionContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return deployRemoteCall(TypeConversionContract.class, web3j, credentials, contractGasProvider, BINARY,  "", chainId);
    }

    public static RemoteCall<TypeConversionContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return deployRemoteCall(TypeConversionContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "", chainId);
    }

    public static TypeConversionContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return new TypeConversionContract(contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    public static TypeConversionContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return new TypeConversionContract(contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }
}
