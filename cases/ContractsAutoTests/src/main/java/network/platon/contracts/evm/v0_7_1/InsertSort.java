package network.platon.contracts.evm.v0_7_1;

import com.alaya.abi.solidity.TypeReference;
import com.alaya.abi.solidity.datatypes.DynamicArray;
import com.alaya.abi.solidity.datatypes.Function;
import com.alaya.abi.solidity.datatypes.Type;
import com.alaya.abi.solidity.datatypes.generated.Int256;
import com.alaya.crypto.Credentials;
import com.alaya.protocol.Web3j;
import com.alaya.protocol.core.RemoteCall;
import com.alaya.protocol.core.methods.response.TransactionReceipt;
import com.alaya.tx.Contract;
import com.alaya.tx.TransactionManager;
import com.alaya.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
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
public class InsertSort extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610331806100206000396000f3fe6080604052600436106100295760003560e01c80631df339cf1461002e578063970f17bd146100f0575b600080fd5b6100ee6004803603604081101561004457600080fd5b810190808035906020019064010000000081111561006157600080fd5b82018360208201111561007357600080fd5b8035906020019184602083028401116401000000008311171561009557600080fd5b919080806020026020016040519081016040528093929190818152602001838360200280828437600081840152601f19601f8201169050808301925050505050505091929192908035906020019092919050505061015c565b005b3480156100fc57600080fd5b50610105610239565b6040518080602001828103825283818151815260200191508051906020019060200280838360005b8381101561014857808201518184015260208101905061012d565b505050509050019250505060405180910390f35b6000806000600192505b8383101561021b5760008086858151811061017d57fe5b602002602001015190508492505b600183101580156101b157508660018403815181106101a657fe5b602002602001015181125b156101f3578660018403815181106101c557fe5b60200260200101518784815181106101d957fe5b60200260200101818152505082806001900393505061018b565b8087848151811061020057fe5b60200260200101818152505050508280600101935050610166565b8460009080519060200190610231929190610291565b505050505050565b6060600080548060200260200160405190810160405280929190818152602001828054801561028757602002820191906000526020600020905b815481526020019060010190808311610273575b5050505050905090565b8280548282559060005260206000209081019282156102cd579160200282015b828111156102cc5782518255916020019190600101906102b1565b5b5090506102da91906102de565b5090565b5b808211156102f75760008160009055506001016102df565b509056fea2646970667358221220e9aef042e9b60b82697112c7124e65c9119f696635678a1ce858a9bd173d019f64736f6c63430007010033";

    public static final String FUNC_OUPUTARRAYS = "OuputArrays";

    public static final String FUNC_GET_ARR = "get_arr";

    protected InsertSort(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    protected InsertSort(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }

    public RemoteCall<TransactionReceipt> OuputArrays(List<BigInteger> arr, BigInteger n, BigInteger vonValue) {
        final Function function = new Function(
                FUNC_OUPUTARRAYS, 
                Arrays.<Type>asList(new DynamicArray<Int256>(
                Int256.class,
                        com.alaya.abi.solidity.Utils.typeMap(arr, Int256.class)),
                new com.alaya.abi.solidity.datatypes.generated.Uint256(n)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<List> get_arr() {
        final Function function = new Function(FUNC_GET_ARR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Int256>>() {}));
        return new RemoteCall<List>(
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public static RemoteCall<InsertSort> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return deployRemoteCall(InsertSort.class, web3j, credentials, contractGasProvider, BINARY,  "", chainId);
    }

    public static RemoteCall<InsertSort> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return deployRemoteCall(InsertSort.class, web3j, transactionManager, contractGasProvider, BINARY,  "", chainId);
    }

    public static InsertSort load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return new InsertSort(contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    public static InsertSort load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return new InsertSort(contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }
}
