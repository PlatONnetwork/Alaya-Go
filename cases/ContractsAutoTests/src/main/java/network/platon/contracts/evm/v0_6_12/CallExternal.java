package network.platon.contracts.evm.v0_6_12;

import com.alaya.abi.solidity.EventEncoder;
import com.alaya.abi.solidity.TypeReference;
import com.alaya.abi.solidity.datatypes.Event;
import com.alaya.abi.solidity.datatypes.Function;
import com.alaya.abi.solidity.datatypes.Type;
import com.alaya.abi.solidity.datatypes.generated.Uint256;
import com.alaya.crypto.Credentials;
import com.alaya.protocol.Web3j;
import com.alaya.protocol.core.DefaultBlockParameter;
import com.alaya.protocol.core.RemoteCall;
import com.alaya.protocol.core.methods.request.PlatonFilter;
import com.alaya.protocol.core.methods.response.Log;
import com.alaya.protocol.core.methods.response.TransactionReceipt;
import com.alaya.tx.Contract;
import com.alaya.tx.TransactionManager;
import com.alaya.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import rx.Observable;
import rx.functions.Func1;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.alaya.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.13.2.1.
 */
public class CallExternal extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610223806100206000396000f3fe60806040526004361061001e5760003560e01c8063de29278914610023575b600080fd5b61002b610041565b6040518082815260200191505060405180910390f35b6000806040516100509061012d565b604051809103906000f08015801561006c573d6000803e3d6000fd5b5090508073ffffffffffffffffffffffffffffffffffffffff1663569c5f6d6040518163ffffffff1660e01b815260040160206040518083038186803b1580156100b557600080fd5b505afa1580156100c9573d6000803e3d6000fd5b505050506040513d60208110156100df57600080fd5b810190808051906020019092919050505091507f0a9f1213b326cb97c7a18f80791661027e1cf7a53125f3d6729d0ae093bd8ad2826040518082815260200191505060405180910390a15090565b60b48061013a8339019056fe6080604052348015600f57600080fd5b5060968061001e6000396000f3fe6080604052348015600f57600080fd5b506004361060285760003560e01c8063569c5f6d14602d575b600080fd5b60336049565b6040518082815260200191505060405180910390f35b60008060019050600060029050808201925050509056fea2646970667358221220053d81a295a5ea209bd81d424aff75549e497e7fccaa54434d0e6c3873957cf164736f6c634300060c0033a264697066735822122013b7e4ea5044d4881dea698534b2f3594a7dd75fe4ef228ba74f6dde82c9cfb364736f6c634300060c0033";

    public static final String FUNC_GETRESULT = "getResult";

    public static final Event EXTERNALCVALUE_EVENT = new Event("ExternalCValue", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
    ;

    protected CallExternal(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    protected CallExternal(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }

    public List<ExternalCValueEventResponse> getExternalCValueEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(EXTERNALCVALUE_EVENT, transactionReceipt);
        ArrayList<ExternalCValueEventResponse> responses = new ArrayList<ExternalCValueEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            ExternalCValueEventResponse typedResponse = new ExternalCValueEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<ExternalCValueEventResponse> externalCValueEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, ExternalCValueEventResponse>() {
            @Override
            public ExternalCValueEventResponse call(Log log) {
                EventValuesWithLog eventValues = extractEventParametersWithLog(EXTERNALCVALUE_EVENT, log);
                ExternalCValueEventResponse typedResponse = new ExternalCValueEventResponse();
                typedResponse.log = log;
                typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<ExternalCValueEventResponse> externalCValueEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(EXTERNALCVALUE_EVENT));
        return externalCValueEventObservable(filter);
    }

    public RemoteCall<TransactionReceipt> getResult(BigInteger vonValue) {
        final Function function = new Function(
                FUNC_GETRESULT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public static RemoteCall<CallExternal> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return deployRemoteCall(CallExternal.class, web3j, credentials, contractGasProvider, BINARY,  "", chainId);
    }

    public static RemoteCall<CallExternal> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return deployRemoteCall(CallExternal.class, web3j, transactionManager, contractGasProvider, BINARY,  "", chainId);
    }

    public static CallExternal load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return new CallExternal(contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    public static CallExternal load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return new CallExternal(contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }

    public static class ExternalCValueEventResponse {
        public Log log;

        public BigInteger value;
    }
}
