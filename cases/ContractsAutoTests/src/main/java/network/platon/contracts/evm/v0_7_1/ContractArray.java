package network.platon.contracts.evm.v0_7_1;

import com.alaya.abi.solidity.TypeReference;
import com.alaya.abi.solidity.datatypes.Address;
import com.alaya.abi.solidity.datatypes.DynamicArray;
import com.alaya.abi.solidity.datatypes.Function;
import com.alaya.abi.solidity.datatypes.Type;
import com.alaya.crypto.Credentials;
import com.alaya.protocol.Web3j;
import com.alaya.protocol.core.RemoteCall;
import com.alaya.protocol.core.methods.response.TransactionReceipt;
import com.alaya.tx.Contract;
import com.alaya.tx.TransactionManager;
import com.alaya.tx.gas.GasProvider;
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
public class ContractArray extends Contract {
    private static final String BINARY = "6080604052600367ffffffffffffffff8111801561001c57600080fd5b5060405190808252806020026020018201604052801561004b5781602001602082028036833780820191505090505b5060009080519060200190610061929190610074565b5034801561006e57600080fd5b50610139565b8280548282559060005260206000209081019282156100ed579160200282015b828111156100ec5782518260006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555091602001919060010190610094565b5b5090506100fa91906100fe565b5090565b5b8082111561013557600081816101000a81549073ffffffffffffffffffffffffffffffffffffffff0219169055506001016100ff565b5090565b610301806101486000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c806326121ff014610046578063807b4c3314610050578063e276c799146100af575b600080fd5b61004e6100e3565b005b6100586101e4565b6040518080602001828103825283818151815260200191508051906020019060200280838360005b8381101561009b578082015181840152602081019050610080565b505050509050019250505060405180910390f35b6100b7610272565b604051808273ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b6100eb6102a9565b6000309080600181540180825580915050600190039060005260206000200160009091909190916101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555030600160006003811061015d57fe5b0160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555030816000600381106101aa57fe5b602002019073ffffffffffffffffffffffffffffffffffffffff16908173ffffffffffffffffffffffffffffffffffffffff168152505050565b6060600080548060200260200160405190810160405280929190818152602001828054801561026857602002820191906000526020600020905b8160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001906001019080831161021e575b5050505050905090565b6000600160006003811061028257fe5b0160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16905090565b604051806060016040528060039060208202803683378082019150509050509056fea2646970667358221220e42b2d698164da0fc48792712937048c9e02d91596783428404e06a4d938980464736f6c63430007010033";

    public static final String FUNC_F = "f";

    public static final String FUNC_GETX = "getx";

    public static final String FUNC_GETY = "gety";

    protected ContractArray(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    protected ContractArray(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }

    public RemoteCall<TransactionReceipt> f() {
        final Function function = new Function(
                FUNC_F, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> getx() {
        final Function function = new Function(FUNC_GETX, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<List> gety() {
        final Function function = new Function(FUNC_GETY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}));
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

    public static RemoteCall<ContractArray> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return deployRemoteCall(ContractArray.class, web3j, credentials, contractGasProvider, BINARY,  "", chainId);
    }

    public static RemoteCall<ContractArray> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return deployRemoteCall(ContractArray.class, web3j, transactionManager, contractGasProvider, BINARY,  "", chainId);
    }

    public static ContractArray load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return new ContractArray(contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    public static ContractArray load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return new ContractArray(contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }
}
